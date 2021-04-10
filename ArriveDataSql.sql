-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6228
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for arrive
CREATE DATABASE IF NOT EXISTS `arrive` /*!40100 DEFAULT CHARACTER SET utf16 COLLATE utf16_bin */;
USE `arrive`;

-- Dumping structure for table arrive.blog
CREATE TABLE IF NOT EXISTS `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imageLink` varchar(1000) COLLATE utf16_bin NOT NULL,
  `blogText` text COLLATE utf16_bin NOT NULL,
  `title` varchar(50) COLLATE utf16_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

-- Dumping data for table arrive.blog: ~6 rows (approximately)
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` (`id`, `imageLink`, `blogText`, `title`) VALUES
	(1, 'https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fspecials-images.forbesimg.com%2Fdam%2Fimageserve%2F1084793354%2F960x0.jpg%3Ffit%3Dscale', 'Did you know that your mental health is just as important as your physical health? Taking care of both is key to overall health. So, what can you do? Keep it simple. It doesn’t take much effort or time to give your mind a boost. There are plenty of activities you can do daily.', 'Sparking Joy'),
	(2, 'https://goodlifefamilymag.com/wp-content/uploads/2018/11/happy.jpg', 'What is meditation?\r\nMeditation involves training your mind to focus on the present moment. If your mind is often racing, then it’s likely you’re not present. Instead, you may be thinking about the past or worrying about the future. Meditation can be a simple way to help reduce stress and create a sense of calm.\r\n\r\nMeditation vs. mindfulness\r\nWhile meditation and mindfulness are both about being aware and in the moment, they are different. Meditation is a seated practice. Mindfulness can be, too, but the difference is that mindfulness can be practiced anywhere. Also, mindfulness includes the practice of meditation.\r\n\r\nHow to meditate\r\nMeditation is about clearing your mind and focusing on breathing. A good place to start is trying a guided meditation to learn how to be in the moment. You can also:\r\n\r\nLook for a local meditation class in your area.\r\nUse an app on your phone\r\nFind a session online.\r\nMake meditation a habit\r\nHere are a few tips to get your practice started:\r\n\r\nCommit to practicing. A little willpower goes a long way.\r\nPick a set time to practice each day. Meditation is easier if it’s part of your routine.\r\nChoose a meditation spot. An ideal location is one that’s comfortable and where you won’t be distracted easily.', 'Healthy Habits'),
	(3, 'https://images.theconversation.com/files/304963/original/file-20191203-66982-1rzdvz4.jpg?ixlib=rb-1.1.0&rect=23%2C15%2C5290%2C3574&q=45&auto=format&w=496&fit=clip', 'Look for ways to relax\r\nTry deep breathing, stretching or meditation. There are also apps that may help you deal with stress.\r\n\r\nLimit how much news you watch\r\nWhile it’s important to have up-to-date, reliable information, too much news can cause stress.\r\n\r\nCreate regular routines\r\nMake time every day for physical activity and connecting with others.\r\n\r\nMake a list\r\nGather a list of contacts. This should include friends, family, neighbors and health care providers. It should also include any therapists or counselors and other community resources. Post it on your refrigerator.\r\n\r\nCheck your medicine supply\r\nMake sure you have any prescription and over-the-counter medicines you need. Try to have a two-week supply of medicines on hand. Talk with your doctor or pharmacist to learn how you can get what you need.\r\n\r\nStay connected\r\nMake staying in touch with your friends and family a regular part of your week. You can call, text, make phone calls or write letters. Try apps that let you video chat with others.\r\n\r\nKeep up with healthy habits\r\nYour physical health is always an important part of your mental health. Don’t use tobacco, alcohol or other drugs to try to deal with stress. Get plenty of rest and physical activity.\r\n\r\nBe aware of stress\r\nHaving to stay at home for a long time can cause stress. For example, you may feel stressed if you can’t work and earn a paycheck. Talk with your employer about why you may be missing work.\r\n\r\nIf need be, call the United States Department of Labor at 1-866-487-2365. Ask about the Family and Medical Leave Act (FMLA). The FMLA offers up to 12 weeks of unpaid leave for dealing with a serious medical problem or to care for a loved one.\r\n\r\nSources\r\n\r\nCenters for Disease Control and Prevention. Get your home ready. cdc.gov/coronavirus/2019-ncov/prepare/get-your-household-ready-for-COVID-19.html. Accessed March 18, 2020.\r\nCenters for Disease Control and Prevention. Household checklist. cdc.gov/coronavirus/2019-ncov/prepare/checklist-household-ready.html?CDC_AA_refVal=https%3A%2F%2Fwww.cdc.gov%2Fcoronavirus%2F2019-ncov%2Fcommunity%2Fhome%2Fchecklist-household-ready.html. Accessed March 18, 2020.\r\nNational Institute of Health: How to prepare. nih.gov/health-information/coronavirus. Accessed March 18, 2020.\r\nSubstance Abuse and Mental Health Administration. Taking care of your behavioral health. samhsa.gov/sites/default/files/tips-social-distancing-quarantine-isolation-031620.pdf.  Accessed March 17, 2020.\r\nWorld Health Organization. Coping with stress during the 2019-nCoV outbreak. who.int/docs/default-source/coronaviruse/coping-with-stress.pdf?sfvrsn=9845bc3a_8. Accessed March 18, 2020.\r\nThe information provided is for general informational purposes only and is not intended to be medical advice or a substitute for professional health care. You should consult an appropriate health care professional for your specific needs.\r\n\r\n', 'Welcome to Arrive'),
	(4, 'https://miro.medium.com/max/700/0*oKTwf_eWha_cS00V', 'Did you know that your mental health is just as important as your physical health? Taking care of both is key to overall health. So, what can you do? Keep it simple. It doesn?t take much effort or time to give your mind a boost. There are plenty of activities you can do daily.<br>Did you know that your mental health is just as important as your physical health? Taking care of both is key to overall health. So, what can you do? Keep it simple. It doesn?t take much effort or time to give your mind a boost. There are plenty of activities you can do daily.<br>Did you know that your mental health is just as important as your physical health? Taking care of both is key to overall health. So, what can you do? Keep it simple. It doesn?t take much effort or time to give your mind a boost. There are plenty of activities you can do daily.', 'Meditation'),
	(6, 'https://miro.medium.com/max/700/0*oKTwf_eWha_cS00V', 'HELLO', 'asdasdqa'),
	(7, 'asda', 'asda', 'asddasd');
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;

-- Dumping structure for table arrive.checkin
CREATE TABLE IF NOT EXISTS `checkin` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CHECKINTEXT` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `FEELVALUE` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `USERID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_checkin_user` (`USERID`),
  CONSTRAINT `FK_checkin_user` FOREIGN KEY (`USERID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

-- Dumping data for table arrive.checkin: ~182 rows (approximately)
/*!40000 ALTER TABLE `checkin` DISABLE KEYS */;
INSERT INTO `checkin` (`ID`, `CHECKINTEXT`, `DATE`, `FEELVALUE`, `USERID`) VALUES
	(2, NULL, NULL, 'Poor', 1),
	(3, NULL, NULL, 'Bad', 1),
	(4, NULL, NULL, 'Neutral', 1),
	(5, NULL, NULL, 'Okay', 1),
	(6, NULL, NULL, 'Okay', 1),
	(7, NULL, NULL, 'Great', 1),
	(8, NULL, NULL, 'Neutral', 1),
	(9, NULL, NULL, 'Poor', 1),
	(10, NULL, NULL, 'Great', 1),
	(11, NULL, NULL, 'Okay', 1),
	(12, NULL, NULL, 'Bad', 1),
	(13, NULL, NULL, 'Bad', 1),
	(14, NULL, NULL, 'Neutral', 1),
	(15, NULL, NULL, 'Poor', 1),
	(16, NULL, NULL, 'Neutral', 1),
	(17, NULL, NULL, 'Okay', 1),
	(18, NULL, NULL, 'Great', 1),
	(19, NULL, NULL, 'Great', 1),
	(20, NULL, NULL, 'Okay', 1),
	(21, NULL, NULL, 'Neutral', 1),
	(22, NULL, NULL, 'Okay', 1),
	(23, NULL, NULL, 'Poor', 1),
	(24, NULL, NULL, 'Poor', 1),
	(25, NULL, NULL, 'Poor', 1),
	(26, NULL, NULL, 'Bad', 1),
	(27, NULL, NULL, 'Neutral', 1),
	(28, NULL, NULL, 'Poor', 1),
	(29, NULL, NULL, 'Okay', 1),
	(30, NULL, NULL, 'Okay', 1),
	(31, NULL, NULL, 'Great', 1),
	(32, NULL, NULL, 'Neutral', 1),
	(33, NULL, NULL, 'Poor', 1),
	(34, NULL, NULL, 'Okay', 1),
	(35, NULL, NULL, 'Neutral', 1),
	(36, NULL, NULL, 'Poor', 1),
	(37, NULL, NULL, 'Poor', 1),
	(38, NULL, NULL, 'Poor', 1),
	(39, NULL, NULL, 'Neutral', 1),
	(40, NULL, NULL, 'Neutral', 1),
	(41, NULL, NULL, 'Neutral', 1),
	(42, NULL, NULL, 'Neutral', 1),
	(43, NULL, NULL, 'Bad', 1),
	(45, NULL, NULL, 'Okay', 1),
	(46, NULL, NULL, 'Poor', 1),
	(47, NULL, NULL, 'Neutral', 1),
	(48, NULL, NULL, 'Okay', 1),
	(49, NULL, NULL, 'Okay', 1),
	(50, NULL, NULL, 'Great', 1),
	(51, NULL, NULL, 'Great', 1),
	(52, NULL, NULL, 'Okay', 1),
	(53, NULL, NULL, 'Bad', 1),
	(54, NULL, NULL, 'Neutral', 1),
	(55, NULL, NULL, 'Okay', 1),
	(56, NULL, NULL, 'Great', 1),
	(57, NULL, NULL, 'Neutral', 1),
	(58, NULL, NULL, 'Poor', 1),
	(59, NULL, NULL, 'Neutral', 1),
	(60, NULL, NULL, 'Poor', 1),
	(61, NULL, NULL, 'Bad', 1),
	(62, NULL, NULL, 'Neutral', 1),
	(63, NULL, NULL, 'Neutral', 1),
	(64, NULL, NULL, 'Okay', 1),
	(65, NULL, NULL, 'Okay', 1),
	(66, NULL, NULL, 'Poor', 1),
	(67, NULL, NULL, 'Great', 1),
	(68, NULL, NULL, 'Okay', 1),
	(69, NULL, NULL, 'Okay', 1),
	(70, NULL, NULL, 'Okay', 1),
	(71, NULL, NULL, 'Great', 1),
	(72, NULL, NULL, 'Great', 1),
	(73, NULL, NULL, 'Okay', 1),
	(74, NULL, NULL, 'Neutral', 1),
	(75, NULL, NULL, 'Neutral', 1),
	(76, NULL, NULL, 'Great', 1),
	(77, NULL, NULL, 'Okay', 1),
	(78, NULL, NULL, 'Poor', 1),
	(79, NULL, NULL, 'Neutral', 1),
	(80, NULL, NULL, 'Okay', 1),
	(81, NULL, NULL, 'Bad', 1),
	(82, 'Test check in!', NULL, 'Great', 1),
	(83, 'This is my second test!', NULL, 'Okay', 1),
	(84, 'Third test', NULL, 'Great', 1),
	(85, 'Hello test redirect', NULL, 'Poor', 1),
	(86, 'This is another redirect test.', NULL, 'Neutral', 1),
	(87, 'hello', NULL, 'Neutral', 1),
	(88, 'This is another test with new css.', NULL, 'Okay', 1),
	(89, 'Hooray', NULL, 'Neutral', 1),
	(90, 'Another test here.', NULL, 'Great', 1),
	(92, 'This will be edited', NULL, 'Great', 1),
	(93, 'Hello\r\n', NULL, 'Poor', 1),
	(94, 'This is preupdate. This is postupdate.', NULL, 'Great', 1),
	(95, 'Today was hard', NULL, 'Poor', 1),
	(96, 'I am okay.', NULL, 'Neutral', 1),
	(98, '55', '2021-04-05', 'Great', 1),
	(99, 'Hello!', '2021-04-05', 'Poor', 1),
	(100, 'Hi I am doing lousy', '2021-04-05', 'Poor', 1),
	(101, 'This is another test with new css.', NULL, 'Okay', 1),
	(102, 'Test check in!', NULL, 'Great', 1),
	(103, NULL, NULL, 'Okay', 1),
	(104, NULL, NULL, 'Neutral', 1),
	(105, NULL, NULL, 'Neutral', 1),
	(106, NULL, NULL, 'Poor', 1),
	(107, NULL, NULL, 'Okay', 1),
	(108, NULL, NULL, 'Great', 1),
	(109, NULL, NULL, 'Neutral', 1),
	(110, NULL, NULL, 'Neutral', 1),
	(111, NULL, NULL, 'Okay', 1),
	(112, 'Hello test redirect', NULL, 'Poor', 1),
	(113, 'Test check in!', NULL, 'Great', 1),
	(114, 'This is my second test!', NULL, 'Okay', 1),
	(115, NULL, NULL, 'Neutral', 1),
	(116, NULL, NULL, 'Okay', 1),
	(117, NULL, NULL, 'Poor', 1),
	(118, 'Test check in!', NULL, 'Great', 1),
	(119, NULL, NULL, 'Okay', 1),
	(120, NULL, NULL, 'Bad', 1),
	(121, 'Hello\r\n', NULL, 'Poor', 1),
	(122, 'Hello\r\n', NULL, 'Poor', 1),
	(123, 'Hooray', NULL, 'Neutral', 1),
	(124, 'This is another test with new css.', NULL, 'Okay', 1),
	(125, 'Hooray', NULL, 'Neutral', 1),
	(126, 'Hooray', NULL, 'Neutral', 1),
	(127, 'This is another test with new css.', NULL, 'Okay', 1),
	(128, 'Third test', NULL, 'Great', 1),
	(129, NULL, NULL, 'Neutral', 1),
	(130, NULL, NULL, 'Great', 1),
	(131, NULL, NULL, 'Okay', 1),
	(132, NULL, NULL, 'Poor', 1),
	(133, NULL, NULL, 'Neutral', 1),
	(134, NULL, NULL, 'Neutral', 1),
	(135, 'Hello!', NULL, 'Okay', 1),
	(136, NULL, NULL, 'Okay', 1),
	(137, NULL, NULL, 'Neutral', 1),
	(138, NULL, NULL, 'Poor', 1),
	(140, NULL, NULL, 'Great', 1),
	(141, 'Not a fan of auth stuff.', '2021-04-05', 'Poor', 1),
	(142, 'Most recent hooray!', '2021-04-05', 'Great', 1),
	(143, 'Today is starting off okay!', '2021-04-06', 'Okay', 1),
	(144, '', '2021-04-06', 'Neutral', 1),
	(145, 'Today was a bit rough.', '2021-04-06', 'Neutral', 1),
	(146, 'Everything is working!!!', '2021-04-06', 'Great', 1),
	(147, NULL, NULL, 'Poor', 1),
	(148, NULL, NULL, 'Okay', 1),
	(149, NULL, NULL, 'Neutral', 1),
	(150, NULL, NULL, 'Neutral', 1),
	(151, NULL, NULL, 'Okay', 1),
	(152, NULL, NULL, 'Bad', 1),
	(153, NULL, NULL, 'Great', 1),
	(154, NULL, NULL, 'Okay', 1),
	(155, NULL, NULL, 'Poor', 1),
	(156, NULL, NULL, 'Neutral', 1),
	(157, NULL, NULL, 'Neutral', 1),
	(158, NULL, NULL, 'Okay', 1),
	(159, NULL, NULL, 'Poor', 1),
	(160, NULL, NULL, 'Poor', 1),
	(161, NULL, NULL, 'Okay', 1),
	(162, NULL, NULL, 'Neutral', 1),
	(163, NULL, NULL, 'Okay', 1),
	(164, NULL, NULL, 'Okay', 1),
	(165, NULL, NULL, 'Neutral', 1),
	(166, NULL, NULL, 'Okay', 1),
	(167, NULL, NULL, 'Great', 1),
	(168, NULL, NULL, 'Poor', 1),
	(169, '', NULL, 'Bad', 1),
	(170, NULL, NULL, 'Neutral', 1),
	(171, NULL, NULL, 'Okay', 1),
	(172, 'Feeling okay.', NULL, 'Okay', 1),
	(173, '', NULL, 'Neutral', 1),
	(174, 'I\'msad', '2021-04-06', 'Poor', 2),
	(179, '', '2021-04-07', 'Neutral', 2),
	(180, 'asdasdas', '2021-04-07', 'Okay', 1),
	(181, 'asdas', '2021-04-07', 'Neutral', 1),
	(182, 'Almost done with the course!', '2021-04-08', 'Great', 1),
	(183, 'Today is rough', '2021-04-08', 'Poor', 1),
	(184, 'Today was a fun day!', '2021-04-09', 'Okay', 1),
	(185, 'What', '2021-04-09', 'Neutral', 1),
	(186, 'I got the squares vs circles working!', '2021-04-09', 'Great', 1),
	(187, 'Hello!', '2021-04-09', 'Neutral', 1),
	(188, 'This is a good test date!', '2021-04-09', 'Okay', 1),
	(189, 'It\'s due', '2021-04-09', 'Poor', 1),
	(190, 'Hooray Sven!', '2021-04-10', 'Great', 1),
	(191, 'Today was great!', '2021-04-10', 'Okay', 1);
/*!40000 ALTER TABLE `checkin` ENABLE KEYS */;

-- Dumping structure for table arrive.resource
CREATE TABLE IF NOT EXISTS `resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `logoPic` varchar(1000) COLLATE utf16_bin NOT NULL DEFAULT '',
  `description` varchar(500) COLLATE utf16_bin NOT NULL DEFAULT '',
  `web` varchar(100) COLLATE utf16_bin NOT NULL DEFAULT '',
  `name` varchar(100) COLLATE utf16_bin DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

-- Dumping data for table arrive.resource: ~4 rows (approximately)
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` (`id`, `logoPic`, `description`, `web`, `name`) VALUES
	(1, 'http://static1.squarespace.com/static/562f0a17e4b00281093af400/t/562f0bcae4b04488967f9b6a/1616762163202/?format=1500w', 'The mission of Mental Health Resources is to foster hope, health and recovery for people affected by mental illness and substance use disorder.', 'http://www.mhresources.org/', 'Mental Health Resources'),
	(2, 'https://www.samhsa.gov/themes/omega_samhsa_main/images/logo2.png', 'The Substance Abuse and Mental Health Services Administration (SAMHSA) is the agency within the U.S. Department of Health and Human Services that leads public health efforts to advance the behavioral health of the nation. SAMHSA\'s mission is to reduce the impact of substance abuse and mental illness on America\'s communities.', 'https://www.samhsa.gov/find-help/national-helpline', 'Substance Abuse and Mental Health Services Administration'),
	(3, 'https://2a392k31wksy2wkejf1y03dp-wpengine.netdna-ssl.com/wp-content/uploads/sites/188/2018/05/cropped-OurLogoBLUEGOLD2-2011WW-copy-1-e1529421697796.jpg', 'NAMI Minnesota (National Alliance on Mental Illness) is a non-profit organization dedicated to improving the lives of children and adults with mental illnesses and their families. For over 40 years, NAMI Minnesota has worked to promote the development of community mental health programs and services, change public attitudes about mental illnesses, improve access to services and increase opportunities for recovery.', 'https://namimn.org/support/resources/general-mental-health-resources/', 'National Alliance on Mental Illness Minnesota'),
	(4, 'https://www.guidestar.org/ViewEdoc.aspx?eDocId=6526676&approved=True', 'Mental Health Minnesota was founded in 1939, and was the state’s first mental health advocacy and education organization. We are a non-profit and non-partisan organization, and an affiliate of Mental Health America.', 'https://mentalhealthmn.org/support/community-resources/statewide-mental-health-resources/', 'Mental Health Minnesota');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;

-- Dumping structure for table arrive.user
CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `FIRSTNAME` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `LASTNAME` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `PASSWORD` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `PIXELPREF` varchar(255) COLLATE utf16_bin DEFAULT NULL,
  `ADMIN` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

-- Dumping data for table arrive.user: ~2 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`ID`, `EMAIL`, `FIRSTNAME`, `LASTNAME`, `PASSWORD`, `PIXELPREF`, `ADMIN`) VALUES
	(1, 'corey@arrive.com', 'Corey', 'Barr', 'admin', 'box', 0),
	(2, 'admin@arrive.com', 'Admin', 'A', 'admin', 'box', 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
