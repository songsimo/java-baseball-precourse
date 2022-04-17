package baseball.model;

import java.util.Objects;

public class Ball {
	private final int MAX_NUMBER = 9;
	private final int MIN_NUMBER = 1;

	private int pitchingNumber;
	private int position;

	public Ball(int pitchingNumber, int position) {
		valid(pitchingNumber);
		this.pitchingNumber = pitchingNumber;
		this.position = position;
	}

	private void valid(int pitchingNumber) {
		if(pitchingNumber < MIN_NUMBER  || MAX_NUMBER < pitchingNumber) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	public BallStatus call(Ball ball) {
		if(this.equals(ball)) {
			return BallStatus.STRIKE;
		}

		if(isEqualNumber(ball.pitchingNumber)) {
			return BallStatus.BALL;
		}

		return BallStatus.NOTHING;
	}

	private boolean isEqualNumber(int number) {
		return pitchingNumber == number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ball ball = (Ball)o;
		return pitchingNumber == ball.pitchingNumber && position == ball.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pitchingNumber, position);
	}
}
