public class Runner extends Thread {
    private volatile Runner runnerBefore;
    private volatile Runner runnerAfter;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner runnerBefore, Runner runnerAfter) {
        this.runnerBefore = runnerBefore;
        this.runnerAfter = runnerAfter;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.println(getName() + " берет палочку");
            if (!getName().equals("runner5")) {
                System.out.println(getName() + " бежит к " + runnerAfter.getName());

            } else {
                System.out.println(getName() + " бежит к финишу");

            }
            sleep(500);
            runnerAfter.start();
            runnerAfter.join();

            if (!getName().equals("runner1")) {
                System.out.println(getName() + " бежит к " + runnerBefore.getName());
                System.out.println(runnerBefore.getName() + " берет палочку");
                sleep(500);
            }

        } catch (Exception ignore) {
        }
    }
}

































































   /* public Runner(String name) {
        this.setName(name);

    }
    public void start(){
        System.out.println(this.getName()+" Берёт палочку  ");
        try {
            {
                System.out.println(this.getName()+" Бежит к " + getName());
            }
            sleep(1000);
        }catch (InterruptedException ie){

        }

    }*/



















/* int runner;
    int numberOfRunner;

    public int getRunner() {
        return runner;
    }

    public void setRunner(int runner) {
        this.runner = runner;
    }

    public int getNumberOfRunner() {
        return numberOfRunner;
    }

    public void setNumberOfRunner(int numberOfRunner) {
        this.numberOfRunner = numberOfRunner;
    }

*/