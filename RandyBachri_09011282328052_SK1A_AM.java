public class RandyBachri_09011282328052_SK1A_AM {
    public String[] merekMobil;
    public double[] hargaMobil;
    public int size;

    public RandyBachri_09011282328052_SK1A_AM(int kapasitas) {
        merekMobil = new String[kapasitas];
        hargaMobil = new double[kapasitas];
        size = 0;
    }

    public void add(String merek, double harga) {
        if (size < merekMobil.length) {
            merekMobil[size] = merek;
            hargaMobil[size] = harga;
            size++;
        } else {
            System.out.println("Array penuh");
        }
    }

    public void set(String merek, double hargaBaru) {
        for (int i = 0; i < size; i++) {
            if (merek.equals(merekMobil[i])) {
                hargaMobil[i] = hargaBaru;
                break;
            }
        }
    }

    public void remove(String merek) {
        for (int i = 0; i < size; i++) {
            if (merek.equals(merekMobil[i])) {
                for (int j = i; j < size - 1; j++) {
                    merekMobil[j] = merekMobil[j + 1];
                    hargaMobil[j] = hargaMobil[j + 1];
                }
                size--;
                merekMobil[size] = null;
                hargaMobil[size] = 0.0;
                break;
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Daftar Harga Mobil Sport:\n");
        for (int i = 0; i < size; i++) {
            result.append("Merek: ").append(merekMobil[i]).append(", Harga: ").append(hargaMobil[i]).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RandyBachri_09011282328052_SK1A_AM daftarHarga = new RandyBachri_09011282328052_SK1A_AM(10);

        daftarHarga.add("Ferrari", 2800000);
        daftarHarga.add("Lamborghini", 3000000);
        daftarHarga.add("Porsche", 2500000);

        System.out.println("Data Harga Mobil Sport:");
        System.out.println(daftarHarga.toString());

        daftarHarga.set("Ferrari", 2600000);

        System.out.println("\nSetelah Ubah Harga Ferrari:");
        System.out.println(daftarHarga.toString());

        daftarHarga.remove("Porsche");

        System.out.println("\nSetelah Hapus Porsche:");
        System.out.println(daftarHarga.toString());
    }
}

