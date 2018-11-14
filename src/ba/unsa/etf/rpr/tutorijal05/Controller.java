package ba.unsa.etf.rpr.tutorijal05;
import javafx.scene.text.Text;

public class Controller {

    private Text tekst;
    private double broj = 0;
    private String operacija = "";

    public Controller() {
        tekst = new Text("0");
    }

    public String getTekst() {
        return tekst.getText();
    }

    public void setTekst(String s) {
        this.tekst.setText(s);
    }

    public Text tekstProperty() {
        return tekst;
    }

    public double getbroj() {
        return broj;
    }

    public void setbroj(double broj) {
        this.broj = broj;
    }

    public String getoperacija() {
        return operacija;
    }

    public void setoperacija(String operacija) {
        this.operacija = operacija;
    }


}