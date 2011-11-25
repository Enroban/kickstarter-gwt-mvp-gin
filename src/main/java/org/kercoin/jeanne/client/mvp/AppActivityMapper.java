package org.kercoin.jeanne.client.mvp;

import org.kercoin.jeanne.client.activity.VisualisationActivity;
import org.kercoin.jeanne.client.place.VisualisationPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class AppActivityMapper implements ActivityMapper {

	@Inject
	Provider<VisualisationActivity> visualisationActivityProvider;

	@Override
	public Activity getActivity(final Place place) {
		if (place instanceof VisualisationPlace) {
			return visualisationActivityProvider.get().setPlace(place);
		}

		return null;
	}

}
