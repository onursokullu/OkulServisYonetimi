package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuDenetleyici extends GirisYapDenetleyici {
	public void baslatServisler(ActionEvent event) throws Exception {

		Parent rootServisler = FXMLLoader.load(getClass().getResource("Servisler.fxml"));
		stage.setScene(new Scene(rootServisler, 803, 528));
		stage.show();

	}

	public void baslatOdeme(ActionEvent event) throws Exception {
		Parent rootOdeme = FXMLLoader.load(getClass().getResource("Odeme.fxml"));
		stage.setScene(new Scene(rootOdeme, 803, 528));
		stage.show();
	}

	public void baslatTaksitRaporu(ActionEvent event) throws Exception {
		Parent rootTaksitRaporu = FXMLLoader.load(getClass().getResource("TaksitRaporu.fxml"));
		stage.setScene(new Scene(rootTaksitRaporu, 803, 528));
		stage.show();

	}

	public void baslatOgrenciler(ActionEvent event) throws Exception {
		Parent rootOgrenciler = FXMLLoader.load(getClass().getResource("Ogrenciler.fxml"));
		stage.setScene(new Scene(rootOgrenciler, 803, 528));
		stage.show();
	}
}
