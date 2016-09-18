CSG base = new Cylinder(10,10,20,(int)30).toCSG()
base.setColor(javafx.scene.paint.Color.GOLD);
CSG secondLevel = new Cylinder(10,10,18,(int)30).toCSG()

CSG movedSecondLevel = secondLevel.movez(23)
movedSecondLevel.setColor(javafx.scene.paint.Color.GOLD);

CSG thirdLevel = base.movez(44)
thirdLevel.setColor(javafx.scene.paint.Color.GOLD);
CSG outside = new Cylinder(9,9,4,(int)30).toCSG()
CSG inside = new Sphere(7).toCSG()

CSG movedCylinder = outside.movez(19)
CSG movedSphere = inside.movez(19)
CSG ring = movedCylinder.difference(movedSphere)
ring.setColor(javafx.scene.paint.Color.BLACK);

CSG secondRing = ring.movez(21)
secondRing.setColor(javafx.scene.paint.Color.BLACK);

CSG thirdRing = secondRing.movez(24)
thirdRing.setColor(javafx.scene.paint.Color.BLACK);

CSG fourthCylinder = new Cylinder(10,8,6,(int)30).toCSG()
CSG movedFourth = fourthCylinder.movez(67)
movedFourth.setColor(javafx.scene.paint.Color.GOLD);

CSG fifthCylinder = new Cylinder(8,11,12,(int)30).toCSG()
CSG movedFifth = fifthCylinder.movez(70)
movedFifth.setColor(javafx.scene.paint.Color.GOLD);

CSG sixthCylinder = new Cylinder(11,2,10,(int)30).toCSG()
CSG movedSixth = sixthCylinder.movez(82)
movedSixth.setColor(javafx.scene.paint.Color.GOLD);

CSG masterJack = base.union(movedSecondLevel.union(ring.union(secondRing.union(thirdLevel.union(thirdRing.union(movedFourth.union(movedFifth.union(movedSixth))))))))
CSG movedMaster = masterJack.movey(40)

CSG box = new Cube (25,25,100).toCSG()
CSG box2 = box.movez(50)
CSG movedBox = box2.movex(30)

CSG casing = box2.difference(masterJack)
CSG movedCasing = casing.movey(90) 


return[movedBox, movedCasing, base, movedSecondLevel, ring, secondRing, thirdLevel, thirdRing, movedFourth, movedFifth, movedSixth, movedMaster]