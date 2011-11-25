package org.kercoin.jeanne.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class VisualisationPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<VisualisationPlace> {

		@Override
		public String getToken(final VisualisationPlace place) {
			return "";
		}

		@Override
		public VisualisationPlace getPlace(final String token) {
			return new VisualisationPlace();
		}

	}
}
