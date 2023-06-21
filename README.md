***
For Loops Java Compiler
***

### Daftar input yang diterima
1. For Loop
2. Nested For Loop
3. Empty Statement For Loop

#### For Loop
```
for ( int i = 0 ; i <= 10 ; i++ ) { }
```

#### Nested For Loop
```
for ( int i = 0 ; i <= 10 ; i++ ) { for ( int j = 0 ; j <= 5 ; j++ { } }
```

#### Empty Statement For Loop
```
for ( ; ; ) { }
```

### Daftar tipe data yang diterima
1. int

### Daftar variabel yang diterima
1. i
2. j
3. k
4. l

### Daftar operator yang diterima
1. `<=`
2. `>=`
3. `<`
4. `>`

### Daftar incement/decrement yang diterima
1. i++
2. i--
3. i += 0
4. i -= 0

### Cara menjalankan
1. Clone repository ini
2. Jalankan Main.java
3. Masukkan input pada terminal

### Kekurangan
Semisal kita memiliki input sebagai berikut

```for ( int j = 0 ; i <= 10 ; i++ ) { }```

Output yang diterima adalah valid. Hal ini tidak sesuai jika kita telusur secara intuisi, karena variable yang dideklarasikan sebelumnya adalah j. Sedangkan variable yang mengalami termination dan increment adalah variable i, yang tidak kita deklarasikan, seharusnya program menghasilkan erorr exception “variable is not defined in scope” begitu juga dengan inputan berikut

```for ( int i = 0 ; i <= 10 ; i++ ) { for ( int i = 0 ; i <= 10 ; i++ ) { } }```

Output yang diterima adalah valid. Hal ini tidak sesuai karena kita tidak boleh mendeklarasikan variable yang sama lebih dari satu kali. Maka seharusnya output yang diterima adalah error exception “variable is already defined in scope”

Kekeliruan ini disebabkan karena algoritma yang kami buat belum memiliki kemampuan untuk mengingat variable apa yang sudah pernah dideklarasi sebelumnya.
