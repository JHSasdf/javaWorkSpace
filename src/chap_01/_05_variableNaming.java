package chap_01;

public class _05_variableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속으로 지음
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, etc)

        // 입국 신고서 (여행)
        String nationality = "Republic of korea";
        String firstName = "jihun";
        String lastName = "Sun";
        int dateOfBirth = 19980219;
        String residentialAddress = "Hotel California";
        String purposeOfVisit = "travel";
        String flightNo = "7C11657";
        String _flightNo = "7C11657";
        int accompany = 2;

        // 상수의 경우 대문자로
        final String CODE = "KR";
    }
}
