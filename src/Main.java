import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> url = Arrays.asList(sc.nextLine());
        String routeParams = url.get(0).split("\\?")[1];
        List<String> brokenRoute = Arrays.asList(routeParams.split("&"));
        LinkedHashMap<String, String> routeParamVals = new LinkedHashMap<>();
        for (String str : brokenRoute) {
            //If there is a value for the key add the val
            if (str.split("=").length > 1) {
                routeParamVals.put(str.split("=")[0], str.split("=")[1]);

            } else { //If there is no value add blank string
                routeParamVals.put(str.split("=")[0], "");
            }
        }
        System.out.println(routeParamVals);
        for (Map.Entry<String, String> entry : routeParamVals.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue().length() > 0 ? entry.getValue() : "none";
        }
        try {
            String password = routeParamVals.get("pass");
            if (!password.equals(null)) {
                System.out.println("password : " + password);
            }
        } catch (Exception e) {

        }

    }
}