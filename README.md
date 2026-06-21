# 📦 CRUD Java Desktop Application (MVC & Memory-Based Array)

Aplikasi desktop Java sederhana yang menerapkan operasi **CRUD (Create, Read, Update, Delete)** untuk manajemen data barang toko. Proyek ini dirancang menggunakan arsitektur **MVC (Model-View-Controller)** dan memanfaatkan fitur visual **Drag-and-Drop GUI** pada NetBeans. 

Untuk kemudahan pembelajaran konsep OOP dasar, penyimpanan data pada versi ini menggunakan objek dinamis **`ArrayList` (RAM/Memory-based)** tanpa ketergantungan pada database eksternal.

---

## 🚀 Fitur Utama

* **Create (Tambah Data):** Memasukkan Kode, Nama, dan Harga barang ke dalam sistem penyimpanan memori.
* **Read (Tampilkan Data):** Menampilkan seluruh data barang yang tersimpan secara dinamis ke dalam komponen `JTable` visual.
* **Update (Ubah Data):** Mengubah informasi Nama atau Harga barang berdasarkan spesifikasi identifikasi unik Kode Barang.
* **Delete (Hapus Data):** Menghapus baris data barang tertentu dari sistem penyimpanan memori.
* **Mouse-Click Table Listener:** Memilih/mengklik baris data pada tabel akan otomatis memindahkan informasi tersebut kembali ke formulir input atas untuk mempermudah proses modifikasi data.
* **Input Data Validation:** Dilengkapi dengan *Exception Handling* (`NumberFormatException`) untuk mencegah aplikasi *crash* jika pengguna memasukkan karakter huruf pada kolom input harga.

---

## 🏗️ Struktur Arsitektur Proyek (MVC)

Proyek ini dibagi secara modular ke dalam beberapa *package* terisolasi untuk memisahkan tanggung jawab kode secara profesional:

* **`model` (`Barang.java`):** Merepresentasikan objek entitas data barang toko dengan konsep Enkapsulasi murni (*private fields* dengan *getter/setter*).
* **`controller` (`BarangController.java`):** Menangani seluruh logika bisnis manipulasi data (*Create, Read, Update, Delete*) di dalam media penyimpanan objek `ArrayList`.
* **`view` (`BarangView.java`):** Mengatur seluruh antarmuka komponen grafis komputer (GUI) yang didesain menggunakan fitur desainer visual *JFrame Form* NetBeans.
* **`main` (`MainApp.java`):** Gerbang utama *entry point* jalannya eksekusi program.

---

## 🛠️ Prasyarat & Lingkungan Pengembangan

Sebelum menjalankan proyek, pastikan lingkungan komputer Anda sudah terpasang:
* **Java Development Kit (JDK):** Versi 8 atau versi di atasnya.
* **IDE:** Apache NetBeans (Direkomendasikan versi terbaru).

---

## 💻 Cara Menjalankan Aplikasi di NetBeans

1.  **Clone atau Unduh Proyek:** Unduh kode sumber proyek ini ke komputer Anda.
2.  **Buka Proyek di NetBeans:** * Buka NetBeans IDE.
    * Pilih menu **File > Open Project**.
