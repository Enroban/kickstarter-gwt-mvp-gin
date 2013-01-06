package org.kercoin.jeanne.client.mvp;

import org.kercoin.jeanne.client.activity.HomeActivity;
import org.kercoin.jeanne.client.place.HomePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class AppActivityMapper implements ActivityMapper {

	@Inject
	Provider<HomeActivity> homeActivityProvider;

	@Override
	public Activity getActivity(final Place place) {
		if (place instanceof HomePlace) {
			return homeActivityProvider.get().setPlace(place);
		}

		return null;
	}

}
