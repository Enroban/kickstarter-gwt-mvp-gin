package org.kercoin.jeanne.client.ui.visu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class VisualisationViewImpl extends Composite implements VisualisationView {

	private static VisualisationViewImplUiBinder uiBinder = GWT.create(VisualisationViewImplUiBinder.class);

	interface VisualisationViewImplUiBinder extends UiBinder<Widget, VisualisationViewImpl> {
	}

	private Presenter presenter;

	public VisualisationViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
