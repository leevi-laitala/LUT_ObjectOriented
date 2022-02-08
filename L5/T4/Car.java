public class Car {
    private Body m_body;
    private Chassis m_chassis;
    private Wheel m_wheels[];
    private Engine m_engine;

    public Car() {
        m_body = new Body();
        m_chassis = new Chassis();
        m_engine = new Engine();
        m_wheels = new Wheel[4];
        
        for (int i = 0; i < m_wheels.length; i++)
            m_wheels[i] = new Wheel();

        print();
    }

    public void print() {
        System.out.println("Car parts:\n\tBody\n\tChassis\n\tEngine\n\t4 Wheel");
    }
}

class Body {
    public Body() {
        System.out.println("Manufacturing: Body");
    }
}

class Chassis {
    public Chassis() {
        System.out.println("Manufacturing: Chassis");
    }
}

class Wheel {
    public Wheel() {
        System.out.println("Manufacturing: Wheel");
    }
}

class Engine {
    public Engine() {
        System.out.println("Manufacturing: Engine");
    }
}
