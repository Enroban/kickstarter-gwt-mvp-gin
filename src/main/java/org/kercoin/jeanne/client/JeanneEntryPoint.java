package org.kercoin.jeanne.client;

import org.kercoin.jeanne.client.gin.JeanneGinjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class JeanneEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final JeanneGinjector ginjector = GWT.create(JeanneGinjector.class);

		final SimplePanel displayMain = ginjector.getWidget();
		ginjector.getContentManager().setDisplay(displayMain);

		final SimplePanel displayContent = ginjector.getWidget();
		ginjector.getActivityManager().setDisplay(displayContent);

		RootPanel.get().add(displayMain);
		RootPanel.get().add(displayContent);

		ginjector.getPlaceHistoryHandler().handleCurrentHistory();
	}
}
