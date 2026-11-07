# Nehe OpenGL ES di Android

## Informasi proyek

| | |
|---|---|
| Mata kuliah | `Grafika Komputer` |
| Dosen | `Ir. I Gede Arta Wibawa, S.T., M.Kom.` |
| Sumber tutorial | https://personal.ntu.edu.sg/ehchua/programming/android/Android_3D.html |

## Anggota Kelompok 1 Kelas C

| No | Nama | NIM |
|---|---|---|
| 1 | I Gede Wikananda Baruna | 2408561011 |
| 2 | Ni Nyoman Amrita Indrasuari | 2408561018 |
| 3 | Kadek Ayu Lianita Devina Sari | 2408561020 |
| 4 | I Putu Renggana Jaya Suputra | 2408561029 |

## Teknologi

- Bahasa: Java
- IDE: Android Studio
- Perangkat uji: HP Android asli

## Daftar tahap

Setiap baris di bawah punya commit sendiri. Nama tag mengikuti kolom **Tag**, sesuaikan dengan tag yang benar-benar kamu buat.

| Tag | Tahap | Konsep utama | Hasil di layar |
|---|---|---|---|
| `example-1` | Setup (Nehe Lesson 1) | `GLSurfaceView`, `Renderer`, `gluPerspective` | Layar kosong |
| `example-2` | Polygon pertama | Vertex array, `FloatBuffer`, `glDrawElements`, `glDrawArrays` | Segitiga dan kotak putih |
| `example-3` | Warna | Color array per vertex, `glColor4f` | Segitiga gradasi RGB dan kotak biru muda |
| `example-4` | Rotasi | `glRotatef`, sudut yang bertambah tiap frame | Bentuk berputar |
| `example-5` | Bentuk 3D | Index array, back-face culling, `glScalef` | Piramida dan kubus berwarna berputar |
| `example-5b` | Variasi kubus (opsional) | `glPushMatrix`, `glPopMatrix` | Kubus yang sama dengan cara berbeda |
| `example-6` | Tekstur | Koordinat tekstur, `GLUtils.texImage2D` | Kubus bergambar |
| `example-6a` | PhotoCube | Enam tekstur, rasio aspek gambar | Kubus dengan 6 gambar berbeda |
| `example-7a` | Input pengguna | Subclass `GLSurfaceView`, `onTouchEvent`, `onKeyUp` | Kubus bisa diputar dan di-zoom |
| `example-7b` | Filter tekstur | NEAREST, LINEAR, mipmap | Tiga kualitas tekstur yang bisa diganti |
| `example-7c` | Pencahayaan | Ambient dan diffuse light | Cahaya bisa dinyalakan dan dimatikan |
| `example-8` | Blending | `glBlendFunc`, depth test | Kubus tembus pandang |

## Struktur kode

```
app/src/main/java/com/test/
├── MyGLActivity.java      Activity utama, memasang GLSurfaceView
├── MyGLSurfaceView.java   View kustom untuk menangkap sentuhan dan tombol
├── MyGLRenderer.java      Renderer: inisialisasi, proyeksi, dan menggambar tiap frame
├── Triangle.java          Segitiga (Example 2 dan 3)
├── Square.java            Kotak (Example 2 dan 3)
├── Pyramid.java           Piramida (Example 5)
├── Cube.java              Kubus berwarna, semua titik ditulis (Example 5)
├── Cube1.java             Kubus dari satu sisi yang diputar berantai (opsional)
├── Cube2.java             Kubus dari satu sisi dengan push dan pop matrix (opsional)
├── TextureCube.java       Kubus bertekstur satu gambar (Example 6 sampai 8)
└── PhotoCube.java         Kubus dengan enam gambar (Example 6a)
```

Gambar tekstur disimpan di `app/src/main/res/drawable/`.

## Cara menjalankan

1. Clone repository ini:
   ```
   [git clone https://github.com/jay24-wq/nehe-opengl-android.git]
   ```
2. Buka folder hasil clone di Android Studio dan tunggu Gradle selesai sinkronisasi.
3. Siapkan gambar tekstur di `app/src/main/res/drawable/` (lihat bagian **Gambar**).
4. Pilih emulator atau HP asli, lalu klik **Run**.

Untuk emulator, aktifkan graphics acceleration. Untuk HP asli, aktifkan **Opsi Pengembang** dan **USB Debugging**.

## Gambar

| File | Dipakai di |
|---|---|
| `nehe.png` | `TextureCube` | 
| `photo1` sampai `photo6` | `PhotoCube` |
| `crate.png` | `TextureCube 7a` | 
| `glass.png` | `TextureCube 8` | 

## Kontrol

| Aksi | Keyboard |
|---|---|
| Putar kubus | Klik kanan mengubah kecepatan putar |
| Zoom out | `A` |
| Zoom in | `Z` |
| Ganti filter tekstur | `F` |
| Nyalakan atau matikan cahaya | `L` |
| Nyalakan atau matikan blending | `B` |

## Cara melihat riwayat per tahap

Lewat website GitHub:

1. Klik tulisan **commits** di atas daftar file untuk melihat semua commit berurutan.
2. Klik satu commit untuk melihat perubahan kodenya (hijau ditambahkan, merah dihapus).
3. Klik **Browse files** untuk melihat seluruh isi proyek pada tahap itu.
4. Atau pilih tahap dari menu dropdown **Tags** di halaman utama.

Lewat terminal:

```
git log --oneline                # daftar commit
git checkout [kode di kolom kiri] (deretan huruf dan angka)     # lihat kondisi proyek pada tahap tertentu
git checkout main                # kembali ke versi terbaru
```

Saat berada di tahap lama, Git menampilkan peringatan `detached HEAD`. Itu normal selama hanya melihat. Untuk mengedit, buat branch dulu dengan `git checkout -b nama-branch`.
