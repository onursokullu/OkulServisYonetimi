package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class GirisYapDenetleyici extends GirisYap {
	public static Stage stageOgr;
	@FXML
	private TextField kullaniciAdi;
	@FXML
	private TextField sifre;
	@FXML
	Label sifreYanlis;

	// Veritabaný iþlemleri bu metodun içinde yapýlacak.
	private boolean kimlikDogrulama() {
		boolean iceriAl = false;
		if (kullaniciAdi.getText().equals("admin") && sifre.getText().equals("123")) {
			iceriAl = true;
		} else {
		}
		return iceriAl;
	}

	public void girisYap(ActionEvent event) throws Exception {
		if (kimlikDogrulama()) {
			Parent rootOgr = FXMLLoader.load(getClass().getResource("Ogrenciler.fxml"));
			stage.setScene(new Scene(rootOgr, 803, 528));
			stage.show();
		} else {
			System.out.println("Çalýþmadý");
			sifreYanlis.setText("Kullanýcý adý veya þifre yanlýþ");
		}
	}

}
