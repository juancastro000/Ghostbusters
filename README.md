# 👻 Ghostbusters [Ghostdevs]  

## 🕵️‍♂️ ¡Algo extraño está ocurriendo en Asturias!  

Desde hace meses, los habitantes de **Asturias** han detectado fenómenos paranormales en aldeas, villas costeras y grandes núcleos urbanos. Extrañas apariciones, voces espectrales y sombras amenazantes han sembrado el pánico en la región.  

💀 **Fantasma feudal** que mueve objetos con telequinesis.  
🌊 **Marinero invisible** que proyecta visiones de naufragios.  
👻 **Dama fantasmal** que posee a los visitantes.  
⚡ **Monja levitante** que crea tormentas de energía.  
🌑 **Sombra gigantesca** que induce miedo y enfrenta a las personas a sus peores temores.  

Ante el creciente número de **actividades paranormales**, se ha creado un **nuevo equipo de Ghostbusters** con una **base de operaciones en un viejo almacén industrial en Avilés**. Este grupo de cazadores de espectros utilizará trampas de protones de última generación y detectores ectoplásmicos avanzados para investigar, capturar y neutralizar a estas entidades.  

**¿Podréis mantener a salvo la región, capturar fantasmas y enfrentaros a los espectros más peligrosos?**  
🔥 ¡Asturias cuenta con vosotros! 🔥  

---

## 📖 **Índice**  
- [🎯 Objetivo del Proyecto](#🎯-objetivo-del-proyecto)  
- [⚙️ Tecnologías Utilizadas](#⚙️-tecnologías-utilizadas)  
- [📜 Historias de Usuario](#📜-historias-de-usuario)  
- [🏗️ Arquitectura del Proyecto](#🏗️-arquitectura-del-proyecto)  
---

## 🎯 **Objetivo del Proyecto**  
El proyecto **Ghostbusters [Ghostdevs]** es una aplicación que permite gestionar una colección de fantasmas, con las siguientes funcionalidades:  

✅ **Capturar nuevos fantasmas** y agregarlos al contenedor ectoplásmico.  
✅ **Visualizar la lista de fantasmas atrapados**, analizando sus características.  
✅ **Liberar fantasmas menos peligrosos** para hacer espacio en el contenedor.  

El sistema ha sido desarrollado aplicando **principios de desarrollo basado en pruebas (TDD)** y respetando la arquitectura **MVC** para separar la lógica de negocio de la interfaz de usuario.  

---

## ⚙️ **Tecnologías Utilizadas**  
- **Java 17**  
- **JUnit 5** + **Hamcrest** (para pruebas unitarias)  
- **Patrón MVC** (Modelo - Vista - Controlador)  
- **Git & GitHub** (Control de versiones)  

---

## 📜 **Historias de Usuario**  
📌 **Capturar Fantasmas:**  
*Como usuario, quiero capturar un nuevo fantasma para expandir mi colección y proteger los lugares emblemáticos de Asturias.*  

📌 **Visualizar Fantasmas Atrapados:**  
*Como usuario, quiero ver todos los fantasmas capturados para analizar sus características y planear estrategias.*  

📌 **Liberar Fantasmas:**  
*Como usuario, quiero liberar fantasmas menos peligrosos o inofensivos para hacer espacio en mi contenedor ectoplásmico.*  

---

## 🏗️ **Arquitectura del Proyecto (MVC)**  

📂 **`com.ghostdevs.ghostbusters.model`** → Modelos de datos (`Fantasma`, `ContenedorEctoplasmico`)  
📂 **`com.ghostdevs.ghostbusters.controller`** → Lógica de negocio (`FantasmaController`)  
📂 **`com.ghostdevs.ghostbusters.view`** → Interfaz de usuario (`MainMenu`, `CapturaFantasmaView`, `ListaFantasmaView`, `LiberarFantasmaView`)  
📂 **`com.ghostdevs.ghostbusters.tests`** → Pruebas unitarias y de integración  

---