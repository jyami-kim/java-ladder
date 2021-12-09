package nextstep.ladder.domain.ladder;

import nextstep.ladder.domain.ladder.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    @DisplayName("사람 수와 높이를 입력하여 사다리를 생성한다.")
    public void init() {
        int sizeOfPerson = 5;
        int height = 4;
        Ladder ladder = Ladder.init(sizeOfPerson, height);
        assertThat(ladder.getLadderLines().size()).isEqualTo(height);
    }
}
