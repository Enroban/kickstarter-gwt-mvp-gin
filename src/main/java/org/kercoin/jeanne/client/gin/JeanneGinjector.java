package org.kercoin.jeanne.client.gin;

import org.kercoin.jeanne.client.mvp.ContentManager;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;

@GinModules(JeanneModule.class)
public interface JeanneGinjector extends Ginjector {

	ActivityManager getActivityManager();

	SimplePanel getWidget();

	PlaceHistoryHandler getPlaceHistoryHandler();

	ContentManager getContentManager();

}
