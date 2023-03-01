public class Habitat {
    public static void main(String[] args) {
        String habitat = "grasslands";
        String result = "";
        switch (habitat) {
            case "grasslands":
                result = "goats, bison, badgers, coyotes";
                break;
            case "jungle":
                result = "snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                result = "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                result = "lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                result = "Invalid";

        }
        System.out.println("In the "+habitat+" you will be able to find:"+result);
    }
}
/*
Create a program that will define a String variable of the habitat you want information on. We should get back information about the animals that can be found in those habitats

	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
 */