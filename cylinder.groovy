CSG base = new Cylinder(9,9,20,(int)30).toCSG()
base.setColor(javafx.scene.paint.Color.GOLD);
CSG secondLevel = new Cylinder(9,9,18,(int)30).toCSG()

CSG movedSecondLevel = secondLevel.movez(23)
movedSecondLevel.setColor(javafx.scene.paint.Color.GOLD);

CSG thirdLevel = base.movez(44)
thirdLevel.setColor(javafx.scene.paint.Color.GOLD);
CSG outside = new Cylinder(8,8,4,(int)30).toCSG()
CSG inside = new Sphere(6).toCSG()

CSG movedCylinder = outside.movez(19)
CSG movedSphere = inside.movez(19)
CSG ring = movedCylinder.difference(movedSphere)
ring.setColor(javafx.scene.paint.Color.BLACK);

CSG secondRing = ring.movez(21)
secondRing.setColor(javafx.scene.paint.Color.BLACK);

CSG thirdRing = secondRing.movez(24)
thirdRing.setColor(javafx.scene.paint.Color.BLACK);

CSG fourthCylinder = new Cylinder(9,7,6,(int)30).toCSG()
CSG movedFourth = fourthCylinder.movez(67)
movedFourth.setColor(javafx.scene.paint.Color.GOLD);

CSG fifthCylinder = new Cylinder(7,10,12,(int)30).toCSG()
CSG movedFifth = fifthCylinder.movez(70)
movedFifth.setColor(javafx.scene.paint.Color.GOLD);

CSG sixthCylinder = new Cylinder(10,2,8,(int)30).toCSG()
CSG movedSixth = sixthCylinder.movez(82)
movedSixth.setColor(javafx.scene.paint.Color.GOLD);

CSG masterJack = base.union(movedSecondLevel.union(ring.union(secondRing.union(thirdLevel.union(thirdRing.union(movedFourth.union(movedFifth.union(movedSixth))))))))
CSG movedMaster = masterJack.movey(40)

CSG box = new Cube (25,25,100).toCSG()
CSG box2 = box.movez(50)
CSG movedBox = box2.movex(30)

CSG casing = box2.difference(masterJack)
CSG scaleeCasing = casing.scalex(1.2)
CSG scalerCasing = scaleeCasing.scaley(1.2)
CSG scaledCasing = scalerCasing.scalez(1.2)
CSG movedCasing = scaledCasing.movey(90) 


return[movedCasing, base, movedSecondLevel, ring, secondRing, thirdLevel, thirdRing, movedFourth, movedFifth, movedSixth,]