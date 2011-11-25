package org.kercoin.jeanne.client.activity;


import org.kercoin.jeanne.client.ui.main.MainView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

public class MainActivity extends AbstractActivity implements MainView.Presenter {

	@Inject
	private PlaceController placeController;

	@Inject
	private MainView view;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

}
