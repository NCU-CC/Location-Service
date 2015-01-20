package tw.edu.ncu.cc.location.server.resource;

import org.hibernate.Session;
import org.hibernate.StatelessSession;
import org.junit.rules.ExternalResource;
import tool.HibernateUtilTestFactory;
import tw.edu.ncu.cc.location.server.service.tool.HibernateUtil;

public class UnitSessionResource extends ExternalResource implements SessionResource {

    private HibernateUtil hibernateUtil;

    @Override
    protected void before() throws Throwable {
        hibernateUtil = new HibernateUtilTestFactory().provide();
    }

    @Override
    protected void after() {
        hibernateUtil.closeSession();
    }

    @Override
    public Session getSession() {
        return hibernateUtil.currentSession();
    }

    @Override
    public StatelessSession getStatelessSession() {
        return hibernateUtil.currentStatelessSession();
    }
}
