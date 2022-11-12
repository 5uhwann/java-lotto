package lotto.domain.lotto.lotto;

import java.util.ArrayList;
import java.util.List;

public class PublishedLotto {

    private final List<Lotto> publishedLotto = new ArrayList<>();

    public void addPublishedLotto(Lotto lotto) {
        publishedLotto.add(lotto);
    }

    public List<Lotto> getPublishedLotto() {
        return publishedLotto;
    }
}