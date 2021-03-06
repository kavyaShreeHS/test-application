package kavya.sample.categorylibrary.model;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import java.util.List;

/**
 * Created by ksreeniv on 06/03/17.
 */

public interface ICategoryDataModel {

    @NonNull
    List<String> getCategoryNames();

    @NonNull
    String getCategoryName(int position);

    Pair<Integer, Integer> getMostClickedCategoryIndex();

    void categoryClicked(int index);

    boolean isFirstTimeUser();
}
