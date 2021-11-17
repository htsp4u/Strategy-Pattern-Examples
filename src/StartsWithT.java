public class StartsWithT implements CheckStrategy {
    @Override
    public boolean check(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        return s.charAt(0) == 't';
    }
}
