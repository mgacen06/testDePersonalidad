drop database if exists testPersonalidad;
create database if not exists testPersonalidad;
use testPersonalidad;

create table preguntaNormal(
	id int primary key auto_increment,
    pregunta varchar(300) not null
);
create table respuestaNormal(
	id int primary key auto_increment,
    respuesta varchar(100) not null,
    idpreguntaNormal int not null,
	puntuacion int not null
);
create table preguntaInicial(
	id int primary key auto_increment,
    pregunta varchar(300) not null
);
create table respuestaInicial(
	id int primary key auto_increment,
    respuesta varchar(100) not null,
    atributo varchar(100) not null,
    idpreguntaInicial int not null
);
create table usuario(
	id int primary key auto_increment,
    nombre varchar(100) not null
);
create table personaje(
	id int primary key auto_increment,
    nombre varchar(100) not null,
    valor varchar(100) not null
);
/*
INICIALES
*/
insert into preguntaInicial values(null,"Te encuentras una tortuga volcada en el desierto.¿Que haces con ella?");

insert into respuestaInicial values(null,"Le ayudas.","Luz",1);
insert into respuestaInicial values(null,"La ignoras.","Neutral",1);
insert into respuestaInicial values(null,"Le das una patada.","Oscuridad",1);

insert into preguntaInicial values(null,"Durante las Guerras Clon eres elegido como oficial en el ejercito republicano, pero uno de tus clones ha sido traumatizado por el combate.¿Que harías con el?");

insert into respuestaInicial values(null,"Le ayudas a recuperarse.","Luz",2);
insert into respuestaInicial values(null,"Lo ejecutas para que no de problemas.","Oscuridad",2);
insert into respuestaInicial values(null,"Le cambio de puesto de trabajo para que no de problemas.","Neutral",2);

insert into preguntaInicial values(null,"Paseando por las calles de Coruscant te cruzas con un clon veterano de las guerras,¿le das unos créditos?");

insert into respuestaInicial values(null,"Si.","Luz",3);
insert into respuestaInicial values(null,"Le apartas de malas maneras, no te agradan los mendigos.","Oscuridad",3);
insert into respuestaInicial values(null,"Le ignoras.","Nuetral",3);

insert into preguntaInicial values(null,"Eres un campesino en un planeta pobre, ¿que harías con un fugitivo herido que ha buscado refugio en tu granero?");

insert into respuestaInicial values(null,"Le das refugio.","Luz",4);
insert into respuestaInicial values(null,"Le delatas para llevarte una recompensa.","Oscuridad",4);
insert into respuestaInicial values(null,"Le dejas a sus aires para no meterte en problemas.","Nuetral",4);
/*
LADO DE LA LUZ
*/
insert into preguntaNormal values(null,"Te encuentras un pequeño templo jedi destartalado. ¿Que haces con el?");

insert into respuestaNormal values(null,"Lo reparas.",1,15);
insert into respuestaNormal values(null,"Meditas en el.",1,10);
insert into respuestaNormal values(null,"Respetas el lugar y te marchas.",1,5);

insert into preguntaNormal values(null,"Tu maestro no te considera preparado para ser caballero. ¿Que harias?");

insert into respuestaNormal values(null,"Aceptas su criterio.",2,20);
insert into respuestaNormal values(null,"Reclamar al consejo.",2,10);
insert into respuestaNormal values(null,"No me considero un Jedi.",2,0);

insert into preguntaNormal values(null,"Consideras los textos Jedi...");

insert into respuestaNormal values(null,"Textos sagrados.",3,20);
insert into respuestaNormal values(null,"Unas simples hojas de papel",3,10);
insert into respuestaNormal values(null,"Me dan igual.",3,'-5');

insert into preguntaNormal values(null,"Consideras la democracia...");

insert into respuestaNormal values(null,"Algo necesario e importante.",4,10);
insert into respuestaNormal values(null,"Un sistema poco eficiente.",4,20);
insert into respuestaNormal values(null,"Una forma de trabajar menos.",4,'-10');

insert into preguntaNormal values(null,"¿Qué harías si tu hijo  se pasara al lado oscuro?");

insert into respuestaNormal values(null,"Pelearía con el sin llegar a matarle.",5,25);
insert into respuestaNormal values(null,"Estaría defraudado y le ignoraría.",5,10);
insert into respuestaNormal values(null,"intentaría que volviera al lado de la luz sea como sea.",5,5);

insert into preguntaNormal values(null,"Te consideras una persona...");

insert into respuestaNormal values(null,"Solitaria.",6,40);
insert into respuestaNormal values(null,"Amistosa.",6,20);
insert into respuestaNormal values(null,"Ambas.",6,15);

insert into preguntaNormal values(null,"¿Cual consideras como tu punto fuerte?");

insert into respuestaNormal values(null,"Mi poder.",7,20);
insert into respuestaNormal values(null,"Mi inteligencia.",7,15);
insert into respuestaNormal values(null,"Mi sociabilidad.",7,0);
/*
LADO DE LA OSCURIDAD
*/
insert into preguntaNormal values(null,"Sheev Palpatine ha declarado la formación de el imperio galactico. ¿Como prestarias tu apoyo a la causa?");

insert into respuestaNormal values(null,"Lo apoyarías militarmente.",8,20);
insert into respuestaNormal values(null,"Lo apoyarías políticamente.",8,5);
insert into respuestaNormal values(null,"Lo apoyarías mediante la fuerza.",8,10);

insert into preguntaNormal values(null,"Los jedi son...");

insert into respuestaNormal values(null,"Una orden corrupta.",9,25);
insert into respuestaNormal values(null,"Una orden criminal.",9,15);
insert into respuestaNormal values(null,"Una orden inutil.",9,5);

insert into preguntaNormal values(null,"¿Engañas a la gente para mantenerlos en la oscuridad ocultandoles tus verdaderos motivos?");

insert into respuestaNormal values(null,"Si.",10,25);
insert into respuestaNormal values(null,"No.",10,15);
insert into respuestaNormal values(null,"A veces.",10,5);

insert into preguntaNormal values(null,"Solo hay dos maneras de hacer algo: mi manera y la manera equivocada.");

insert into respuestaNormal values(null,"De acuerdo.",11,20);
insert into respuestaNormal values(null,"En desacuerdo.",11,15);
insert into respuestaNormal values(null,"A medias.",11,5);

insert into preguntaNormal values(null,"¿Cual consideras como tu punto fuerte?");

insert into respuestaNormal values(null,"El miedo.",12,0);
insert into respuestaNormal values(null,"Mi dominio de la fuerza.",12,15);
insert into respuestaNormal values(null,"Mi habilidad marcial.",12,10);

insert into preguntaNormal values(null,"¿Como dominarias la galaxia?");

insert into respuestaNormal values(null,"El miedo.",13,0);
insert into respuestaNormal values(null,"Mi dominio de la fuerza.",13,10);
insert into respuestaNormal values(null,"Mi habilidad marcial.",13,20);

insert into preguntaNormal values(null,"¿Como afrontas un problema?");

insert into respuestaNormal values(null,"Cargando contra el.",14,15);
insert into respuestaNormal values(null,"Mediante el engaño.",14,10);
insert into respuestaNormal values(null,"Mediante la estrategia.",14,5);
/*
LADO NEUTRAL
*/
insert into preguntaNormal values(null,"Eres un cazarrecompensas.¿Como entregarias a tu objetivo si te estuviera dando problemas?");

insert into respuestaNormal values(null,"Me esforzaria por entregarlo vivo.",15,25);
insert into respuestaNormal values(null,"Muerto.",15,15);
insert into respuestaNormal values(null,"Nunca sería un cazarrecompensas.",15,5);

insert into preguntaNormal values(null,"En cuanto al destino del planeta Mandalore,¿Como habrias dejado a su planeta?");

insert into respuestaNormal values(null,"Armado.",16,30);
insert into respuestaNormal values(null,"Desarmado.",16,10);
insert into respuestaNormal values(null,"Lo ignoraria por completo.",16,5);

insert into preguntaNormal values(null,"¿Que opinas del imperio?");

insert into respuestaNormal values(null,"Una oportunidad de negocio.",17,0);
insert into respuestaNormal values(null,"Una molestia.",17,10);
insert into respuestaNormal values(null,"Una dictadura horrible.",17,15);

insert into preguntaNormal values(null,"¿Como seria tu tipo de nave ideal?");

insert into respuestaNormal values(null,"Ágil y rapida.",18,20);
insert into respuestaNormal values(null,"Pesada y potente.",18,10);
insert into respuestaNormal values(null,"Me es indiferente.",18,0);

insert into preguntaNormal values(null,"¿Cual es tu epoca preferida de la saga?");

insert into respuestaNormal values(null,"Imperio.",19,'-5');
insert into respuestaNormal values(null,"Republica.",19,15);
insert into respuestaNormal values(null,"Nueva Republica.",19,25);

insert into preguntaNormal values(null,"¿Que proteccion usarias?");

insert into respuestaNormal values(null,"Una armadura.",20,20);
insert into respuestaNormal values(null,"Unos guardias personales.",20,'-5');
insert into respuestaNormal values(null,"No necesito proteccion, me basta con mi intelecto.",20,10);

insert into preguntaNormal values(null,"¿Por que lucharias?");

insert into respuestaNormal values(null,"Por la republica.",21,10);
insert into respuestaNormal values(null,"Por dinero.",21,0);
insert into respuestaNormal values(null,"Por mi vida.",21,20);

/*
PERSONAJES LUZ
*/
insert into personaje values(null,"Princesa Leia Organa",0);
insert into personaje values(null,"Padmé Amidala",11);
insert into personaje values(null,"Luke Skywalker",21);
insert into personaje values(null,"Anakin Skywalker",41);
insert into personaje values(null,"Obi-Wan Kenobi",61);
insert into personaje values(null,"Yoda",81);
/*
PERSONAJES OSCURIDAD
*/
insert into personaje values(null,"Gran Molf Wilhuff Tarkin",0);
insert into personaje values(null,"Gran Almirante Thrawn",31);
insert into personaje values(null,"General Grievous",51);
insert into personaje values(null,"Conde  Dooku",61);
insert into personaje values(null,"Darth Malak",71);
insert into personaje values(null,"Sheev Palpatine",91);
/*
PERSONAJES NEUTRAL
*/
insert into personaje values(null,"Java el Hut",0);
insert into personaje values(null,"Teniente Gorn",11);
insert into personaje values(null,"Luthen Rael",41);
insert into personaje values(null,"Boba Fett",51);
insert into personaje values(null,"Bo-Katan Kryze",71);
insert into personaje values(null,"Din Djarin",91);



