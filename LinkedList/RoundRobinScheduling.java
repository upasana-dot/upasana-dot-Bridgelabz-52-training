package LinkedList;

class Process {

    int pid;
    int burst;
    Process next;

    Process(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
    }
}

class RoundRobin {

    Process head;

    void addProcess(int pid, int burst) {

        Process newProcess = new Process(pid, burst);

        if (head == null) {
            head = newProcess;
            newProcess.next = head;
            return;
        }

        Process temp = head;

        while (temp.next != head)
            temp = temp.next;

        temp.next = newProcess;
        newProcess.next = head;
    }

    void schedule(int quantum) {

        Process temp = head;

        if (head == null)
            return;

        do {

            if (temp.burst > quantum) {

                System.out.println("Process " + temp.pid + " executed for " + quantum);
                temp.burst -= quantum;
            }

            else {

                System.out.println("Process " + temp.pid + " completed");
                temp.burst = 0;
            }

            temp = temp.next;

        } while (temp != head);
    }
}

public class RoundRobinScheduling {

    public static void main(String[] args) {

        RoundRobin rr = new RoundRobin();

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        rr.schedule(4);
    }
}
