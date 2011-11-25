package org.kercoin.jeanne.client.mvp;

import org.kercoin.jeanne.client.place.VisualisationPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ //
	VisualisationPlace.Tokenizer.class //
})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
