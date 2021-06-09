public class ProjectTest {
    public static void main(String[] args) {

        Project handwraps = new Project();
        Project gloves = new Project("Boxing Gloves");
        Project mouthguard = new Project("Mouthguard", "Used to protect a fighter's teeth.");
        Project bag = new Project("Heavy Bag", "100kg Heavy punching bag used to practice striking techniques.", 259.99);

        System.out.println(handwraps.pitch());
        System.out.println(gloves.pitch());
        System.out.println(mouthguard.pitch());
        System.out.println(bag.pitch());

        System.out.println("-------------------------");
        handwraps.setName("Handwraps");
        handwraps.setDescription("Cloth wraps used to protect a fighter's hands");
        handwraps.setInitialCost(9.99);
        System.out.println(handwraps.pitch());

        System.out.println("--- NAMES ---");
        System.out.println(handwraps.getName());
        System.out.println(gloves.getName());
        System.out.println(mouthguard.getName());
        System.out.println(bag.getName());
        
        System.out.println("--- DESCRIPTION ---");
        System.out.println(handwraps.getDescription());
        System.out.println(gloves.getDescription());
        System.out.println(mouthguard.getDescription());
        System.out.println(bag.getDescription());

    }
}