CSG base = new Cylinder(10,10,20,(int)30).toCSG()
CSG secondLevel = new Cylinder(10,5,20,(int)30).toCSG()

CSG movedSecondLevel = secondLevel.movez(20)

CSG outside = new Cylinder(9,9,3,(int)30).toCSG()
CSG inside = new Sphere(7).toCSG()

CSG movedCylinder = outside.movez(10)
CSG movedSphere = inside.movez(10)
CSG ring = movedCylinder.difference(movedSphere)
CSG cylinder2 = base.difference(ring)

return[cylinder2, movedSecondLevel, ring]