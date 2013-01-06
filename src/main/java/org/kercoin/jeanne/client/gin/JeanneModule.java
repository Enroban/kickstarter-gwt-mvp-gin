package org.kercoin.jeanne.client.gin;

import org.kercoin.jeanne.client.mvp.AppActivityMapper;
import org.kercoin.jeanne.client.mvp.AppPlaceController;
import org.kercoin.jeanne.client.mvp.AppPlaceHistoryMapper;
import org.kercoin.jeanne.client.place.HomePlace;
import org.kercoin.jeanne.client.ui.home.HomeView;
import org.kercoin.jeanne.client.ui.home.HomeViewImpl;
import org.kercoin.jeanne.client.ui.menu.MenuView;
import org.kercoin.jeanne.client.ui.menu.MenuViewImpl;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class JeanneModule extends AbstractGinModule {

	@Override
	protected void configure() {

		// MVP
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
		bind(AppPlaceHistoryMapper.class).in(Singleton.class);

		bind(MenuView.class).to(MenuViewImpl.class).in(Singleton.class);
		bind(HomeView.class).to(HomeViewImpl.class).in(Singleton.class);
	}

	@Singleton
	@Provides
	ActivityManager getActivityManager(final ActivityMapper activityMapper, final EventBus eventBus) {
		return new ActivityManager(activityMapper, eventBus);
	}

	@Singleton
	@Provides
	PlaceController getPlaceController(final EventBus eventBus) {
		return new AppPlaceController(eventBus);
	}

	@Singleton
	@Provides
	PlaceHistoryHandler getPlaceHistoryHandler(final AppPlaceHistoryMapper historyMapper, final EventBus eventBus, final PlaceController placeController) {
		final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, new HomePlace());
		return historyHandler;
	}

}
