CSG base = new Cylinder(10,10,20,(int)30).toCSG()
CSG secondLevel = new Cylinder(10,10,18,(int)30).toCSG()

CSG movedSecondLevel = secondLevel.movez(23)

CSG outside = new Cylinder(9,9,4,(int)30).toCSG()
CSG inside = new Sphere(7).toCSG()

CSG movedCylinder = outside.movez(19)
CSG movedSphere = inside.movez(19)
CSG ring = movedCylinder.difference(movedSphere)
CSG secondRing = ring.movez(21)
secondRing.setColor(javafx.scene.paint.Color.BLACK);


return[base, movedSecondLevel, ring, secondRing]