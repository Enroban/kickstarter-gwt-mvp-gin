package org.kercoin.jeanne.client.activity;


import org.kercoin.jeanne.client.mvp.HasPlace;
import org.kercoin.jeanne.client.place.VisualisationPlace;
import org.kercoin.jeanne.client.ui.visu.VisualisationView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

public class VisualisationActivity extends AbstractActivity implements HasPlace, VisualisationView.Presenter {

	@Inject
	private VisualisationView view;

	@Inject
	private PlaceController placeController;

	private VisualisationPlace place;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

	@Override
	public Activity setPlace(final Place place) {
		this.place = (VisualisationPlace) place;
		return this;
	}

}
