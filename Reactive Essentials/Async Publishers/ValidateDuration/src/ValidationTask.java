import java.time.Duration;

import reactor.core.publisher.Mono;

public class ValidationTask {

	public static Mono<Void> validate(Duration duration) {
		if (duration.isZero() || duration.isNegative()) {
			return Mono.error(new IllegalArgumentException("Zero or neg duration"));
		} else {
			return Mono.empty();
		}
	}
}