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

    public void jedan(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("1");
        } else {
            setTekst(getTekst() + "1");
        }
    }

    public void dva(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("2");
        } else {
            setTekst(getTekst() + "2");
        }

    }

    public void tri(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("3");
        } else {
            setTekst(getTekst() + "3");
        }
    }

    public void cetiri(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("4");
        } else {
            setTekst(getTekst() + "4");
        }
    }

    public void pet(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("5");
        } else {
            setTekst(getTekst() + "5");
        }
    }

    public void sest(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("6");
        } else {
            setTekst(getTekst() + "6");
        }
    }

    public void sedam(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("7");
        } else {
            setTekst(getTekst() + "7");
        }
    }

    public void osam(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("8");
        } else {
            setTekst(getTekst() + "8");
        }
    }

    public void devet(ActionEvent actionEvent) {
        if (getTekst().equals("0")) {
            setTekst("9");
        } else {
            setTekst(getTekst() + "9");
        }
    }

    public void nula(ActionEvent actionEvent) {
        if (!getTekst().equals("0")) {
            setTekst(getTekst() + "0");
        }
    }

    public void plus(ActionEvent actionEvent) {
        setOperandPrvi(Double.parseDouble(getTekst()));
        setOperacija("+");
        setTekst("0");
    }

    public void minus(ActionEvent actionEvent) {
        setOperandPrvi(Double.parseDouble(getTekst()));
        setOperacija("-");
        setTekst("0");
    }

    public void slash(ActionEvent actionEvent) {
        operandPrvi = Double.parseDouble(getTekst());
        operacija = "/";
        setTekst("0");
    }

    public void puta(ActionEvent actionEvent) {
        operandPrvi = Double.parseDouble(getTekst());
        operacija = "x";
        setTekst("0");
    }

    public void tacka(ActionEvent actionEvent) {
        if (!getTekst().contains(".")) {
            setTekst(getTekst() + ".");
        }
    }


    public void posto(ActionEvent actionEvent) {
        setOperandPrvi(Double.parseDouble(getTekst()));
        setOperacija("%");
        setTekst("0");
    }
}