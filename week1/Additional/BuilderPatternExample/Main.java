public class Main {
    public static void main(String[] args) {
        
        Computer gamingPC = new Computer.ComputerBuilder("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setOS("Windows 11")
                .build();

        Computer officePC = new Computer.ComputerBuilder("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setOS("Windows 10")
                .build();

        Computer budgetPC = new Computer.ComputerBuilder("AMD Ryzen 3")
                .setRAM(8)
                .build();

        Computer.display(gamingPC);
        Computer.display(officePC);
        Computer.display(budgetPC);
    }
}
