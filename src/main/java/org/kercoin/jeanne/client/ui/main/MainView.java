package org.kercoin.jeanne.client.ui.main;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface MainView extends IsWidget {

	void setPresenter(Presenter listener);

	public interface Presenter {

		void goTo(Place place);
	}
}
