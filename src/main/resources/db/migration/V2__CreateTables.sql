CREATE TABLE IF NOT EXISTS `addresses` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  `complement` varchar(255) DEFAULT NULL,
  `neighborhood` varchar(255) NOT NULL,
  `number` varchar(9) NOT NULL,
  `state` varchar(2) NOT NULL,
  `street` varchar(255) NOT NULL,
  `zip_code` varchar(9) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `campaigns` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `own_benefit` bit(1) DEFAULT NULL,
  `hospital_id` bigint(20) DEFAULT NULL,
  `patient_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6rro9yoapuvm22mk2il4bxkry` (`hospital_id`),
  KEY `FKj0e80rbjmr8od84366iqkxq04` (`patient_id`),
  KEY `FKf87ciwyq426ojtf24dktwq5r3` (`user_id`),
  CONSTRAINT `FK6rro9yoapuvm22mk2il4bxkry` FOREIGN KEY (`hospital_id`) REFERENCES `addresses` (`id`),
  CONSTRAINT `FKf87ciwyq426ojtf24dktwq5r3` FOREIGN KEY (`user_id`) REFERENCES `persons` (`id`),
  CONSTRAINT `FKj0e80rbjmr8od84366iqkxq04` FOREIGN KEY (`patient_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `events` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6ruilm3mxe7une70kteoqbhbs` (`user_id`),
  CONSTRAINT `FK6ruilm3mxe7une70kteoqbhbs` FOREIGN KEY (`user_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
CREATE TABLE IF NOT EXISTS `persons` (
  `person_type` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `blood_type` varchar(255) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `name` varchar(255) NOT NULL,
  `weight` decimal(9,2) NOT NULL DEFAULT '0.00',
  `email` varchar(255) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_1x5aosta48fbss4d5b3kuu0rd` (`email`),
  KEY `FKhpk0ck378u9nar5y4b4cwb8sd` (`address_id`),
  CONSTRAINT `FKhpk0ck378u9nar5y4b4cwb8sd` FOREIGN KEY (`address_id`) REFERENCES `addresses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
