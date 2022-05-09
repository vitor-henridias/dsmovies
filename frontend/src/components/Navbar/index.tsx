import {ReactComponent as GithubIcon} from 'assets/img/github.svg';


function Navbar() {
   
    return (
        <header>
        <nav>
          <div>
            <h1>DSMovie</h1>
            <a href="https://github.com/vitor-henridias">
              <div>
                <GithubIcon />
                <p>/devsuperior</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );

}

export default Navbar;