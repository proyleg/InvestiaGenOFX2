/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2;

import investiagenofx2.model.Account;
import investiagenofx2.model.Investment;
import investiagenofx2.model.Transaction;
import investiagenofx2.util.OFXUtilites;
import investiagenofx2.util.Utilities;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import ofx.OFX;

/**
 *
 * @author Pierre
 */
public class TestAccount extends Application {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account("Type1", "Fidelity", LocalDate.now());
        Investment investment = new Investment("FID1222", "Fidelity dummy1", "1000", "1.0", "1000.0");
        account.add(investment);
        Transaction transaction = new Transaction(LocalDate.now(), "Distribution", "1000", "", "FID1222", "1000", "1.0", "1000.0");
        account.add(transaction);
        accounts.add(account);

        account = new Account("Type2", "C. I.", LocalDate.now());
        investment = new Investment("MFC1222", "Mutual dummy2", "2000", "1.0", "2000.0");
        account.add(investment);
        transaction = new Transaction(LocalDate.now(), "Distribution", "2000", "", "MFC1222", "2000", "1.0", "2000.0");
        account.add(transaction);
        accounts.add(account);

        int numAccount = 5;
        String a[] = {"Pierre\\REER-A(NV)", "Pierre\\TFSA(FID)", "", "", ""};
        String b[] = {"Tax-Free Savings Account\\C.I. Investments", "Tax-Free Savings Account\\Fidelity Investments Canada Limited", "", "", ""};
        String c[] = {"", "", "", "", ""};

        String aa = a[0];
        for (int i = 1; i < numAccount; i++) {
            aa = aa + "#" + a[i];
        }
        String aaa[] = aa.split("#");
        int indexOfb = Arrays.asList(b).indexOf("TFSA(FID)");
        System.out.println(indexOfb);
        
        ArrayList<String> ss = new ArrayList<>(5);
        ss.add("aaaa");
        ss.add("bbbb");
        ss.add("cccc");
        ss.add("dddd");
        
        int indss = ss.indexOf("cccc");
        

        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.CANADA_FRENCH)));
        
        Platform.exit();
        System.exit(0);

    }

    private static String genOFXFile(ArrayList<Account> accounts) {
        OFXUtilites.setCurrency("CAD");
        OFXUtilites.setIntubid("04297");
        OFX ofx = new OFX();
        ofx.setSIGNONMSGSRSV1(OFXUtilites.genSignonResponseMessageSet("20151228100000", "Investia"));
        ofx.setINVSTMTMSGSRSV1(OFXUtilites.genTransacInvestmentStatementResponseMessageSet(accounts));
        ofx.setSECLISTMSGSRSV1(OFXUtilites.genSecurityListResponseMessageSet(accounts));
        String fileName = "testOutput.xml";
        Utilities.genOFXFile(ofx, fileName);
        return fileName;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
