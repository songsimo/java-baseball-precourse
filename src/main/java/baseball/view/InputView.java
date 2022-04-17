package baseball.view;

import nextstep.utils.Console;

public class InputView {
	private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
	private static final String CONTINUE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static String printPitchingQuestion() {
		System.out.print(INPUT_MESSAGE);

		return Console.readLine();
	}

	public static String printContinuousQuestion() {
		System.out.println(CONTINUE_MESSAGE);

		return Console.readLine();
	}
}
