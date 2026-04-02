package Stack.Quene;

public class CircularTourProblemUsingQueue {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPetrolPump(petrol, distance);
        if (start != -1) {
            System.out.println("Starting petrol pump index: " + start);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static int findStartingPetrolPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int end = 1;
        int currentPetrol = petrol[start] - distance[start];

        while (start != end || currentPetrol < 0) {
            while (currentPetrol < 0 && start != end) {
                currentPetrol -= (petrol[start] - distance[start]);
                start = (start + 1) % n;

                if (start == 0) {
                    return -1; // No solution exists
                }
            }

            currentPetrol += (petrol[end] - distance[end]);
            end = (end + 1) % n;
        }

        return start; // Starting index of the circular tour
    }
    
}
