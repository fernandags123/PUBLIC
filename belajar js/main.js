//alert("WOI......");


disini setau saya adalah kita akan mengirim pengisian 
prompt lewat browser dan akan menampilkan sebuah alert yang sudah kita isi*/

let name = prompt("Your Name: ")
let age = Number(prompt("Your Age: "))
let birthDate = prompt("Your Birth Date: ")
let address = prompt("Your Address: ")
let campus = prompt("Your Campus: ")
let email = prompt("Your Email: ")

alert(`
    Name: ${name}
    Age: ${age}
    Birth Date: ${birthDate}
    Address: ${address}
    Campus: ${campus}
    Email: ${email}
    `)


// untuk menampilkan hasil dari semua data yang suadah dibuat atau dimasukkan


 disini kita mengisi dari dalam vs code dan akan di tampilkan di 
alert(pop up) browser*/

let username = prompt("Masukkan Username: ")
let password = prompt('Masukkan password: ')
let Id = "Fernanda Galih Saputra"
let age = "22"
let birtDate = "18 September 2003"
let address = "Tasikmadu, Karanganyar Jawa Tengah"
let campus = "Universitas Diponegoro"
let email = "fernanda@gmail.com"

if(username === "Fernanda Galih Saputra" && password === "123") {
    alert("Login Berhasil")
} else {
    alert("Login Salah")
}

alert(`
    =============== USER PROFIL =============== 
    ID: ${Id}
    Age: ${age}
    Birth Date: ${birtDate}
    Address: ${address}
    Campus: ${campus}
    Email: ${email}
    ========================================== 
    `)


let nama = 'Fernanda Galih Saputra'
let usia = 22
let tinggiBadan = 173.5
let beratBadan
let pacar = 1

beratBadan = 68

switch(pacar) {
    case 1:
        pacar = 'Sudah punya 1'
        break
    case 2:
        pacar = 'Sudah punya 2'
        break
    case 3:
        pacar = 'Sudah punya 3'
        break
    default:
        pacar = 'Belum punya pacar :('
        break
}


if(pacar) {
    pacar = (`sudah punya`)
} else {
    (`Belum punya`)
}

// alert(`Nama saya adalah ${nama} usia saya ${usia} untuk tinggi badan ${tinggiBadan}cm dan berat badan ${beratBadan}kg serta pacar saya ialah ${pacar}`)

//ini ketika kita ingin menghitung menggunakan code ini const untuk menggabung variable

let saldoAwal = 50000
let saldoTambahan = 50000
let hutang = 30000
const saldoTotal = saldoAwal + saldoTambahan - hutang

alert(`Total saldo sisa: Rp.${saldoTotal}`)



// Array nama pacar dan manipulasi datanya
namaPacar = ['Upik', 'Galuh', 'Wirasmi']
namaPacar.push('Fernanda', 'Galih', 'Saputra')
namaPacar.shift()
namaPacar.pop()

alert(namaPacar)

ini adalah kondisi awal nilai kosong yang bisa di timpa dari luar, karena let itu masih bisa di timpa

let namaPacar = []
namaPacar[0] = 'Upik'
namaPacar[1] = 'Galuh'
namaPacar[2] = 'Nandes'
namaPacar.pop()
alert(namaPacar)

//for loop

// 3 statement
// jadi disini kita punya 3 buat data nama jika kita ingin menampilkan semua nama yang rapi kita pakai
//let i = 0; itu akan mendeskripsikan urutan data ke berapa dan untuk (nama pacar[i] itu akan menghasilkan tampilan di console.log)

namaPacar = ['Upik', 'Galuh', 'Wirasmi']
for (let i = 0; i < namaPacar.length; i++) {
    console.log(namaPacar[i])
}



//disini jika nilainya sama hasilnya tetap akan tidak muncul

let i = 9
while (i < 9) {
    i++
    console.log('Fernanda Galih ')
}




// disini do while akan tetap me loop 1 kali walaupun nilai tetap sama

let i = 10
do {
    i++
    console.log('Fernanda Galih')
} while( i < 10)


//tugas
/*
1. promp untuk mengetahui saldo akhir dari apa yang di inputkan oleh user
2. menentukan hari dari tanggal yang ada saat ini di pc kita = {hari ini adalh hari }
*/



let umur = Number(prompt("Masukkan umur: "))

if(umur < 13) {
    alert("Kategori: anak-anak")
} else if (umur <= 17) {
    alert("kategori: remaja")
} else {
    alert("Kategori: Dewasa")
}







let saldoAwal = prompt("Saldo awal anda: ")
let saldoPembelian = prompt("Saldo Setelah Pembelian: ")
const saldoAkhir = saldoAwal - saldoPembelian 

alert(`
    Saldo Akhir anda adalah: Rp.${saldoAkhir}`)



let hari = new Date().getDay()
let hariHari = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday',]
const hasil = hariHari[hari]
alert(`hari ini adalah hari ${hasil}`)



let saldoAwal = Number(prompt("Masukkan saldo awal anda: "))
let saldoPenarikan = Number(prompt("Jumlah penarikan: "))

if (saldoAwal < saldoPenarikan) {
    alert("Saldo tidak cukup")
} else {
    let saldoAkhir = saldoAwal - saldoPenarikan
    alert(`Saldo sisa Rp.${saldoAkhir}`)
}




let umur = Number(prompt("Masukkan umur: "))

if(umur < 13) {
    alert("Kategori: anak-anak")
} else if (umur <= 17) {
    alert("kategori: remaja")
} else {
    alert("Kategori: Dewasa")
}




let nilai = Number(prompt("Masukkan nilai: "))

if(nilai < 60) {
    alert("Tidak lulus")
} else if (nilai <= 79) {
    alert("Lulus")
} else {
    alert("Lulus dengan pujian")
}



let username = prompt("Masukkan username: ")
let password = prompt("Masuukkan password: ")

if(username === 'admin' && password === "12345") {
    alert("Login berhasil")
} else {
    alert("Username atau Password salah")
}




let angka = Number(prompt("Masukkan angka"))

if(angka > 0) {
    alert("Positif")
}else if (angka < 0){
    alert("Negatif")
}else {
    alert("NOL")
}



let hari = prompt("Masukkan hari:").toLowerCase()

if (
    hari === "senin" ||
    hari === "selasa" ||
    hari === "rabu" ||
    hari === "kamis" ||
    hari === "jumat"
) {
    alert("Hari Kerja")
} else if (hari === "sabtu" || hari === "minggu") {
    alert("Hari Libur")
} else {
    alert("Nama hari tidak valid")
}



let totalBelanja = Number(prompt("Masukkan  Belanja: "))
let diskon = 0;

if(totalBelanja >= 100000) {
    diskon = totalBelanja * 0.20
} else if (totalBelanja >= 50000) {
    diskon = totalBelanja * 0.10
} else {
    diskon = 0
}

let totalBayar = totalBelanja - diskon

alert(`
    Total Belanja: ${totalBelanja}
    Diskon: ${diskon}
    Total Bayar: ${totalBayar}`)



let username = prompt("Masukkan Username: ")
let password = prompt("Masukkan password: ")

if(username === 'nandesz' && password === '12345') {
    alert('Login berhasil')

    let barang = prompt("Masukkan Barang: ")
    let harga = Number(prompt("Masukkan Harga: "))

    alert(`
        Nama barang adalah: ${barang}
        Harga: ${harga}
        `)

} else {
    alert('Username atau Password Gagal')
}


let username = prompt('Masukkan username: ')
let password = prompt('Masukkan passwor: ')

if(username === 'Fernanda Galih Saputra' && password === '12345') {
    alert('Login berhasil')

    let nama = prompt("Masukkan nama: ")
    let nim = Number(prompt("Masukkan nim: "))
    let fakultas = prompt('Masukkan fakultas: ')
    let prodi = prompt("Masukkan prodi: ")
    let smt = prompt("Masukkan semester: ")
    alert(`
        Nama: ${nama}
        Nim: ${nim}
        Fakultas: ${fakultas}
        Prodi: ${prodi}
        Semester: ${smt}
        `)
} else {
    alert('Login Gagal')
}

let password = prompt('Masukkan password: ')

if(password === '12345') {
    alert('Login berhasil')
    let saldoAwal = Number(prompt("Masukkan saldo awal: "))
    let saldoTambahan = Number(prompt("Masukkan saldo tambahan: "))
    let hutang = Number(prompt("Masukkan hutang: "))
    const saldoSisa = saldoAwal + saldoTambahan - hutang

    alert(`Sisa saldo Rp.${saldoSisa}`)
} else {
    alert('Login gagal')
}

let password = prompt('Masukkan password: ')

if (password === '12345') {
    alert('Login berhasil')

    const barang = ['Kasur', 'Guling', 'Bantal']

    let pilihan = prompt('Hapus barang pertama ya/tidak?')

    if (pilihan === 'ya') {
        barang.shift()
        alert('Barang pertama berhasil dihapus')
    }

    alert('Daftar barang: ' + barang.join(', '))

} else {
    alert('Login gagal')
}

