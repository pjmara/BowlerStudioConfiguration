CSG base = new Cylinder(10,10,20,(int)30).toCSG()
CSG secondLevel = new Cylinder(10,10,18,(int)30).toCSG()

CSG movedSecondLevel = secondLevel.movez(23)
movedSecondLevel.setColor(javafx.scene.paint.Color.GOLD);

CSG thirdLevel = base.movez(45)
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

CSG fourthCylinder = new Cylinder(10,8,4,(int)30).toCSG()
CSG movedFourth = fourthCylinder.movez(70)


return[base, movedSecondLevel, ring, secondRing, thirdLevel, thirdRing, movedFourth]