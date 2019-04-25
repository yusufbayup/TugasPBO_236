package uts;

/**
 *
 * @author RYZEN
 */

public class Komputer {
    private CPU cpu;
    
    public Komputer (CPU cpu){
        this.cpu = cpu;
    }
    
    public void mencabut (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : " +this.cpu.getCPUData()+ " GHz" + " dicabut");
    }
    
    public void memasang (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : " +this.cpu.getCPUData()+ " GHz" + " dipasang");
    }
    
    public void cetakInfo (){
        System.out.println("Spesifikasi: CPU: " +this.cpu.getCPUData()+ " GHz");
    }
}