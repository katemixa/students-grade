import org.apache.commons.lang3.RandomStringUtils;

public class UtilsRandom {

    public static String generateRandomTextFirstCapital(){
        String randomText = RandomStringUtils.randomAlphabetic(4,12);
        return randomText.substring(0,1).toUpperCase() + randomText.substring(1).toLowerCase();
    }

    public static int generateRandomGrade(){
        return Integer.parseInt(RandomStringUtils.random(1, false, true));
    }
}
