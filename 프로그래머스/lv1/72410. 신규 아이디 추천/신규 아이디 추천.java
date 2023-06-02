class Solution {
    public String solution(String new_id) {
        // 1. 대 --> 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2. 알파소, 숫자, -, _, .만 허용 --> 나머지는 모두 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        // 3. 마침표 2번 이상 --> 하나로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");
        // 4. 마침표가 처음/끝에 위치 --> 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        // 5. 빈 문자열 --> a 대입
        if(new_id.isEmpty()) {
            new_id = "a";
        }
        // 6. 길이 16자 이상이면 15자만 남기고 제거 > 마지막 마침표 제거
        if(new_id.length() > 15) {
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        }
        // 7. 길이 2자 이하면 마지막 문자를 길이 3이 될 때까지 추가
        if (new_id.length() < 3) {
            StringBuilder sb = new StringBuilder(new_id);
            while(sb.length() < 3) {
                sb.append(new_id.charAt(new_id.length()-1));
            }
            new_id = sb.toString();
        }
        return new_id;
    }
}