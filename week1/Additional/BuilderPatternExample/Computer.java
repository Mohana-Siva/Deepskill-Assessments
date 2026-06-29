public class Computer {

    // Basic computer parts
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String os;

    // Build from the builder
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Show the computer details.
    public static void display(Computer c){
        System.out.println("CPU : "+c.cpu);
        System.out.println("GPU : "+c.gpu);
        System.out.println("RAM : "+c.ram);
        System.out.println("Storage : "+c.storage);
        System.out.println("OS : "+c.os);
        System.out.println("-----x-----");

    }


    // Builder for Computer
    public static class ComputerBuilder {

        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private String os;

        //initialising the instance using constructor
        public ComputerBuilder(String cpu) {
            this.cpu = cpu;
        }
    
        // Set RAM
        public ComputerBuilder setRAM(int ram) {
            this.ram = ram;
            return this;
        }
        
        // Set storage
        public ComputerBuilder setStorage(int Storage) {
            this.storage = Storage;
            return this;
        }
        // Set GPU
        public ComputerBuilder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }
        // Set OS.
        public ComputerBuilder setOS(String os) {
            this.os = os;
            return this;
        }

        // Create the object and return
        public Computer build(){
            return new Computer(this);
        }

    }

}
