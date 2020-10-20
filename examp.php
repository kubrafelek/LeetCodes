<?php

function topla() {
  $toplam = 0;
  $argumanSayisi = func_num_args();
  for ($i = 0; $i < $argumanSayisi; $i ++) {
    $toplam += func_get_arg($i);
  }
  return $toplam;
}

// Ornek Kullanim
// echo topla(5, 10, 15); // 30 dondurur