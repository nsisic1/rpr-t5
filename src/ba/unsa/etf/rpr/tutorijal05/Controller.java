package ba.unsa.etf.rpr.tutorijal05;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class Controller {

    private Text tekst;
    private double operandPrvi = 0;
    private String operacija = "";

    public Controller() {
        tekst = new Text("0");
    }

    private String getTekst() {
        return tekst.getText();
    }

    private void setTekst(String s) {
        this.tekst.setText(s);
    }

    public Text tekstProperty() {
        return tekst;
    }

    private double getOperandPrvi() {
        return operandPrvi;
    }

    private void setOperandPrvi(double operandPrvi) {
        this.operandPrvi = operandPrvi;
    }

    private String getOperacija() {
        return operacija;
    }

    private void setOperacija(String operacija) {
        this.operacija = operacija;
    }


}